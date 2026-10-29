/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99842c..0x998548 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99842c_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[16];
    unsigned short field_38;
    unsigned long long field_3a;
    char padding_42[2238];
    unsigned long long field_900;
    unsigned long long field_908;
    unsigned long long field_910;
} st_99842c_1;

typedef struct st_99842c_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[1720];
    unsigned int field_6d0;
    unsigned int field_6d4;
    unsigned long long field_6d8;
    char padding_6e0[8];
    unsigned long long field_6e8;
    unsigned long long field_6f0;
    char padding_6f8[16];
    unsigned short field_708;
    unsigned long long field_70a;
    char padding_712[2238];
    unsigned long long field_fd0;
    unsigned long long field_fd8;
    unsigned long long field_fe0;
} st_99842c_0;


unsigned int sub_99842c(st_99842c_0 *a0, st_99842c_1 **a1, unsigned int *a2, char *a3, unsigned long long *a4, unsigned long long *a5, unsigned short *a6, unsigned long long *a7)
{
    unsigned long v2;  // x8
    st_99842c_0 *v3;  // x9
    st_99842c_1 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_fd0;
    if (v2 < (unsigned long long)*(long long *)&a0->padding_712[2232])
    {
        v3 = (char *)a0 + 72 * v2;
        a0->field_fd0 = v2 + 1;
        v4 = &v3->field_6d0;
        *a1 = v4;
        *a2 = v3->field_6d0;
        *a3 = v3->field_6d4;
        *a4 = v3->field_6f0 + v3->field_6e8;
        *a5 = v3->field_6d8;
        if (!(int)a0->field_10)
            return 1;
        *a6 = v4->field_38;
        *a7 = *(long long *)&(&v4->field_38)[1];
        return 1;
    }
    else if (a0->field_fd8 == *(long long *)&a0->padding_712[2232])
    {
        (*(long long *)(*(long long *)&a0[1].padding_18[312] + 40))();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1137, "tls_read_record");
        sub_996e84(a0, 80, 321, 0);
        return 0xfffffffe;
    }
}

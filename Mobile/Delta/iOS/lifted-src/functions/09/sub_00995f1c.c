/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x995f1c..0x996074 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_995f1c_1 {
    char field_0;
    char padding_1[3];
    unsigned int field_4;
    long long field_8;
    long long field_10;
} st_995f1c_1;

typedef struct st_995f1c_0 {
    char field_0;
    char padding_1[3];
    unsigned int field_4;
} st_995f1c_0;


long long sub_995f1c(long long a0, st_995f1c_0 *a1, long long a2, st_995f1c_1 *a3, long long a4, long long *a5, unsigned long long *a6)
{
    long long v2;  // x1
    long long v3;  // x21
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(int *)(a0 + 4120) && a1->field_0 == 23)
    {
        a3->field_8 = 0;
        a3->field_10 = 0;
        a3->field_4 = a1->field_4;
        a3->field_0 = 23;
        v2 = *a5;
        v3 = v2 & 7 ^ 3;
        a5[3] = v3;
        if (sub_c68800(a4, v2, a5[2], 0))
        {
            *a6 = 1;
            v4 = a0;
            if (sub_a6e830(a4, v3, 0))
                goto LABEL_995ff4;
            sub_a368c8(v4, a1, a2);
            sub_a369bc("ssl/record/methods/tls1_meth.c", 661, "tls1_initialise_write_packets");
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls1_meth.c", 656, "tls1_initialise_write_packets");
            v4 = a0;
        }
        sub_996e84(v4, 80, 0xc0103, 0);
        return 0;
    }
LABEL_995ff4:
}

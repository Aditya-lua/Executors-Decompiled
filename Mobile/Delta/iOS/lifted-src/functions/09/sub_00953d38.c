/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953d38..0x953df8 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953d38_1 {
    char padding_0[1264];
    struct st_953d38_0 *field_4f0;
} st_953d38_1;

typedef struct st_953d38_0 {
    char padding_0[304];
    unsigned long long field_130;
    char padding_138[128];
    unsigned int field_1b8;
} st_953d38_0;


unsigned long long sub_953d38(st_953d38_1 *a0)
{
    st_953d38_0 *v2;  // x8
    unsigned int v3;  // w9
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_4f0;
    v3 = v2->field_1b8 + 1;
    v2->field_1b8 = v3;
    if (v3 >= 3)
    {
        if (!(sub_962ef0(a0) >> 12 & 1))
        {
            v4 = sub_9d46fc(sub_95f8bc(a0), 47, 0, 0);
            v2 = a0->field_4f0;
            if (v2->field_130 > v4)
                v2->field_130 = v4;
        }
        else
        {
            v2 = a0->field_4f0;
        }
    }
    if (v2->field_1b8 < 13)
        return 0;
    sub_a368c8();
    sub_a369bc("ssl/d1_lib.c", 383, "dtls1_check_timeout_num");
    sub_9a58a4(a0, 0xffffffff, 312, 0);
    return 0xffffffff;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97c7f4..0x97c8ac (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97c7f4_0 {
    char padding_0[120];
    long long field_78;
    unsigned long long field_80;
    char padding_88[8];
    long long field_90;
    char padding_98[8];
    long long field_a0;
    long long field_a8;
    char padding_b0[160];
    unsigned short field_150;
} st_97c7f4_0;


unsigned long long sub_97c7f4(st_97c7f4_0 *a0, unsigned short a1)
{
    unsigned long long v2;  // x0
    unsigned short v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_95eea4(a0->field_78);
    a0->field_78 = 0;
    v2 = sub_976fa4(a0->field_a0);
    a0->field_a0 = 0;
    v3 = (unsigned short)a0->padding_98;
    if (v3 && !a0->field_80 && !(a0->field_150 >> 9 & 1))
    {
        sub_9d5018(sub_97725c(v3));
        sub_9d5018(sub_975fec(v3));
        sub_981120(a0->padding_98);
        *(unsigned long long *)a0->padding_98 = 0;
        v2 = sub_97b82c(a0->field_90);
        a0->field_90 = 0;
    }
    if (a1)
        v2 = sub_ad93b4(a0->field_a8);
    if (a0->field_80)
    {
        return v2;
    }
    else if (a0->field_150 >> 9 & 1)
    {
        return v2;
    }
}

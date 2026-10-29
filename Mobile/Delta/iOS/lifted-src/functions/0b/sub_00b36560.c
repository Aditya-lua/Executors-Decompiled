/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb36560..0xb36618 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b36560_0 {
    long long field_0;
    char padding_8[28];
    unsigned int field_24;
    char padding_28[16];
    unsigned long long field_38;
    long long field_40;
} st_b36560_0;

typedef struct st_b36560_1 {
    char padding_0[80];
    unsigned long long field_50;
    char padding_58[8];
    unsigned int field_60;
} st_b36560_1;


unsigned long long sub_b36560(st_b36560_0 *a0, st_b36560_1 *a1, unsigned long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if (a1->field_50)
    {
        sub_a2a8a4(a0->field_0);
        a0->field_0 = 0;
        v3 = sub_a646b8();
        a0->field_40 = v3;
        if (!v3)
            return 0xfffffffe;
        a0->field_38 = "HKDF";
        v4 = sub_a2a930(a1);
        if (!(unsigned int)v4)
            return v4;
        a0->field_0 = a1;
        a0->field_24 = 0x2000;
    }
    else
    {
        return 0;
    }
}

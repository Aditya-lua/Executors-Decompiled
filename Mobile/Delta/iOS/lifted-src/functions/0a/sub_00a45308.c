/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa45308..0xa4542c (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a45308_0 {
    char padding_0[280];
    unsigned int field_118;
    unsigned int field_11c;
    char field_120;
    char padding_121[455];
    int field_2e8;
} st_a45308_0;


unsigned long long sub_a45308(long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x20
    st_a45308_0 *v3;  // x0
    st_a45308_0 *v4;  // x19
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_9ffdd8();
    if (!a1 && !v2)
        return 1;
    v4 = v3;
    if (a1)
    {
        v5 = sub_9bf864(a1, sub_a50904(a0) * 8, v4);
        sub_a94ad4(&v4->field_120, v4, " )");
        if (v5 >> 31 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/e_aria.c", 233, "aria_gcm_init_key");
            sub_a36abc(6, 176, 0);
            return 0;
        }
        if (v2 || v4->field_11c && !(v2 = *(long long *)&v4->padding_121[447], !*(long long *)&v4->padding_121[447]))
        {
            sub_a94bbc(&v4->field_120, v2, v4->field_2e8);
            v4->field_11c = 1;
        }
        v4->field_118 = 1;
        return 1;
    }
    else
    {
        if (v4->field_118)
            sub_a94bbc(&v4->field_120, v2, v4->field_2e8);
        else
            _memcpy(*(long long *)&v4->padding_121[447], v2, v4->field_2e8);
        v4->field_11c = 1;
        *(unsigned int *)&v4[1].padding_0[4] = 0;
        return 1;
    }
}

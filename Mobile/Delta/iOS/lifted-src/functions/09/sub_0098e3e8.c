/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e3e8..0x98e540 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e3e8_0 {
    unsigned long long field_0;
    long long field_8;
} st_98e3e8_0;

typedef struct st_98e3e8_1 {
    struct st_98e3e8_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    char field_30;
} st_98e3e8_1;


unsigned long long sub_98e3e8(long long a0, char a1, st_98e3e8_1 *a2)
{
    unsigned long long v2;  // x23
    st_98e3e8_0 *v3;  // x8
    unsigned long long *v12;  // x8
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    char i;  // x21
    char v10;  // x22
    char v11;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2->field_8;
    if (!v2)
        return 0;
    v3 = a2->field_0;
    v4 = sub_a6ed9c();
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_a6ed9c(a0, v3->field_8);
    if (!(unsigned int)v5)
        return v5;
    v6 = sub_a6ed9c(a0, (a2->field_10 >> 3) / 125 >> (a1 & 63));
    if (!(unsigned int)v6)
        return v6;
    v7 = sub_a6ed9c(a0, v2 - 1);
    if (!(unsigned int)v7)
        return v7;
    v8 = sub_a6ed9c(a0, v3->field_8 - v3->field_0);
    if (!(unsigned int)v8)
        return v8;
    i = v2 - 1;
    if (v2 != 1)
    {
        v10 = 0;
        do
        {
            v11 = i;
            v12 = (char *)a2->field_0 + v10;
            v13 = sub_a6ed9c(a0, *v12 - v12[3] - 2);
            if (!(unsigned int)v13)
                return v13;
            v14 = sub_a6ed9c(a0, v12[3] - v12[2]);
            if (!(unsigned int)v14)
                return v14;
            v10 += 16;
            i = v11 - 1;
        } while (i);
    }
    if (!(a2->field_30 & 1))
        return 1;
    v15 = sub_a6ed9c(a0, a2->field_18);
    if (!(unsigned int)v15)
        return v15;
    v16 = sub_a6ed9c(a0, a2->field_20);
    if (!(unsigned int)v16)
        return v16;
    v17 = sub_a6ed9c(a0, a2->field_28);
    if (!(unsigned int)v17)
        return v17;
    return 1;
}

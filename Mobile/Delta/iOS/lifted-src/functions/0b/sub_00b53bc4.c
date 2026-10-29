/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53bc4..0xb53cd8 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53bc4_0 {
    char padding_0[16];
    long long field_10;
    char field_18;
    char padding_19[50];
    char field_4b;
    char padding_4c[260];
    long long field_150;
    long long field_158;
    long long field_160;
} st_b53bc4_0;


unsigned long long sub_b53bc4(st_b53bc4_0 *a0, long long a1, unsigned long a2, long long a3)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    long long v5;  // x0
    long long v6;  // x0
    long long v7;  // x21
    char v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    a0->field_18 = a0->field_18 | 1;
    v3 = sub_b53a40();
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_b54378(a0, a1);
    if (!(unsigned int)v4)
        return v4;
    if (!a0->field_160)
    {
        v5 = sub_a3f728();
        a0->field_160 = v5;
        if (!v5)
            return v5;
    }
    v6 = sub_9c7b68(a0->field_158);
    a0->field_150 = 0;
    if (sub_c688bc(&v0, &a0->field_4b, 0x100) && sub_afd2b4(&v0, 0xffffffff, a0->field_10, v6) && sub_a6eaf8(&v0))
    {
        sub_c68eb8(&v0, &a0->field_150);
        v7 = sub_a6e990(&v0);
        sub_a6ed4c(&v0);
        if (v7 && a0->field_150)
            _memmove(&a0->field_4b, v7);
    }
    else
    {
        sub_a6ed4c(&v0);
    }
    return sub_a3f7f0(a0->field_160, a0->field_158, a3) != 0;
}

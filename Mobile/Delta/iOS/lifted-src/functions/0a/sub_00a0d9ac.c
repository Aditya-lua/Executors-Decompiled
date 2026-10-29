/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0d9ac..0xa0daf0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0d9ac_0 {
    char padding_0[31];
    char field_1f;
} st_a0d9ac_0;

extern char g_10002b0;

long long sub_a0d9ac(unsigned long a0, st_a0d9ac_0 *a1, long long a2, unsigned long a3)
{
    long long v12;  // x0
    long long v13;  // x21
    long long v14;  // w0
    long long v15;  // x19
    char v0;  // [bp-0x1b0]
    char v1;  // [bp-0x188]
    char v2;  // [bp-0x160]
    char v3;  // [bp-0x110]
    char v4;  // [bp-0xf1]
    char v5;  // [bp-0xd0]
    char v6;  // [bp-0xa8]
    char v7;  // [bp-0x80]
    char v8;  // [bp-0x58]
    unsigned long v9;  // [bp-0x38]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v12 = sub_a40ca8();
    if (v12)
    {
        v13 = v12;
        v14 = (unsigned int)sub_a40abc(a2, 32, &v3, 0, v13, 0);
        sub_a3f52c(v13);
        if (v14)
        {
            v3 &= 248;
            v4 = 64 | (64 | v4 & 63) & 63;
            sub_a0b134(&v0, &v3);
            sub_a0ff20(&v7, &v2);
            sub_a10314(&v6, &v0, &v7);
            sub_a10314(&v5, &v1, &v7);
            sub_a106a8(a1, &v5);
            sub_a106a8(&v8, &v6);
            a1->field_1f = a1->field_1f ^ v8 * 128;
            v15 = 1;
        }
        else
        {
            v15 = 0;
        }
        sub_a66ec0(&v3, 64);
    }
    else
    {
        v15 = 0;
    }
    if (*(long long *)&g_10002b0 == v9)
        return v15;
    ___stack_chk_fail();
}

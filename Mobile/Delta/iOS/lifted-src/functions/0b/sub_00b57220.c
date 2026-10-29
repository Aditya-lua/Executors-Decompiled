/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb57220..0xb572e8 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b57220_1 {
    char padding_0[32];
    char field_20;
    char padding_21[75];
    char field_6c;
    char padding_6d[83];
    char field_c0;
    char padding_c1[127];
    struct st_b57220_0 *field_140;
} st_b57220_1;

typedef struct st_b57220_0 {
    struct st_b57220_0 *field_0;
} st_b57220_0;


int sub_b57220(st_b57220_1 *a0, long long a1, long long a2, st_b57220_0 **a3)
{
    st_b57220_0 **i;  // x19
    long long v3;  // x21
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a3;
    v3 = a2;
    v4 = a1;
    if (a0->field_140)
        a0->field_140();
    if (i > 0x3fffffff)
    {
        do
        {
            sub_9fb5f8(v3, v4, 0x40000000, &a0->field_c0, &a0->field_20, __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
            i += 0x1ffffffff8000000;
            v3 += 0x40000000;
            v4 += 0x40000000;
        } while (i > 0x3fffffff);
    }
    if (!i)
        return 1;
    sub_9fb5f8(v3, v4, i, &a0->field_c0, &a0->field_20, __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
    return 1;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaad090..0xaad0d4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aad090_0 {
    char padding_0[8];
    struct st_aad090_1 *field_8;
} st_aad090_0;

typedef struct st_aad090_1 {
    unsigned int field_0;
} st_aad090_1;


int sub_aad090(st_aad090_0 *a0, unsigned long a1, unsigned long a2)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aadf44(0);
    if (v2)
    {
        sub_a5ab14(a0, *(int *)a0->field_8, v2);
        v2 = 1;
    }
    return v2;
}

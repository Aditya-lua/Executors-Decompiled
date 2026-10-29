/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5c38..0x5c94 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5c38_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_5c38_0;


void* sub_5c38(void* a0, void* a1)
{
    st_5c38_0 *v3;  // x0
    unsigned long long v4;  // x8
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_61fc(&v0);
    v4 = v3->field_10;
    *(uint128_t *)a0 = v3->field_0;
    *(unsigned long long *)&a0[16] = v4;
    memset(a1, 0, 24);
    if ((char)a0[23] < 0)
        return a0;
    sub_6b08(a0);
    return a0;
}

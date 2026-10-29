/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e180..0x3e1d8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e180_0 {
    char field_0;
} st_3e180_0;


void* sub_3e180(void* a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_3e180_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3e180_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!*(long long *)a0)
        return a0;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    sub_425f4(*(long long *)a0, (long long)a0[8]);
    operatordelete(*(long long *)a0);
    *(unsigned long long *)a0 = 0;
    *(unsigned long long *)&a0[8] = 0;
    return a0;
}

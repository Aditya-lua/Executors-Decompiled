/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f440..0x1f488 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f440_1 {
    char padding_0[16];
    void* field_10;
} st_1f440_1;

typedef struct st_1f440_0 {
    unsigned long long field_0;
} st_1f440_0;


void* sub_1f440(st_1f440_1 *a0, void* a1)
{
    void* v2;  // x0
    st_1f440_0 **v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    if (v2 == a1)
        return v2;
    v3 = *(long long *)((char *)v2 - 48);
    a0->field_10 = v2 - 48;
    (*v3)();
}

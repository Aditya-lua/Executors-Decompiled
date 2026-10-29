/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96854..0xa96a10 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a96854_1 {
    unsigned long long field_0;
} st_a96854_1;

typedef struct st_a96854_0 {
    struct st_a96854_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    uint128_t field_28;
    char padding_38[32];
    unsigned long long field_58;
} st_a96854_0;


unsigned long long sub_a96854(st_a96854_0 *ptr, unsigned long a1, unsigned long a2, unsigned long long *a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    memset(ptr, 0, 176);
    *(uint128_t *)&(&ptr->field_20)[1] = 0x50000000000000000;
    v2 = sub_a6bf4c(80, "crypto/modes/ocb128.c", 158);
    *(unsigned long long *)&ptr->padding_38[24] = v2;
    if (!v2)
        return 0;
    ptr->field_0 = a3;
    ptr->field_8 = a4;
    ptr->field_18 = a2;
    ptr->field_20 = a5;
    ptr->field_10 = a1;
    a3();
}

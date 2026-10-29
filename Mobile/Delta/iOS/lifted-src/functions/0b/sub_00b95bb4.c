/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb95bb4..0xb95da0 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b95bb4_0 {
    struct st_b95bb4_1 *field_0;
    char padding_8[8];
    char field_10;
} st_b95bb4_0;

typedef struct st_b95bb4_1 {
    unsigned long long field_0;
} st_b95bb4_1;


int sub_b95bb4(st_b95bb4_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (1 < a0->field_10 - 13)
        return 1;
    goto *((void *)(sub_b95c00 + *(char *)(*(long long *)a0->field_0 + 14705504) * 4));
}

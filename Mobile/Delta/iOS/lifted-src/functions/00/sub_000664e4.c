/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x664e4..0x66504 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_664e4_1 {
    char padding_0[24];
    struct st_664e4_2 *field_18;
} st_664e4_1;

typedef struct st_664e4_0 {
    char padding_0[48];
    unsigned long long field_30;
} st_664e4_0;

typedef struct st_664e4_2 {
    struct st_664e4_0 *field_0;
} st_664e4_2;


void sub_664e4(st_664e4_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_18)
    {
        v0 = &v2;
        v1 = v3;
        sub_198d8(0);
    }
    goto *((void *)(*(long long *)(*(long long *)a0->field_18 + 48)));
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62ed0..0x62ef8 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62ed0_1 {
    struct st_62ed0_0 *field_0;
    char padding_8[16];
    struct st_62ed0_2 *field_18;
    struct st_62ed0_2 *field_20;
} st_62ed0_1;

typedef struct st_62ed0_0 {
    char padding_0[80];
    unsigned long long field_50;
} st_62ed0_0;

typedef struct st_62ed0_2 {
    char field_0;
} st_62ed0_2;


long long sub_62ed0(st_62ed0_1 *a0)
{
    char *v0;  // x8

    v0 = a0->field_18;
    if (v0 != a0->field_20)
    {
        a0->field_18 = v0 + 1;
        return *v0;
    }
    goto *((void *)(a0->field_0->field_50));
}

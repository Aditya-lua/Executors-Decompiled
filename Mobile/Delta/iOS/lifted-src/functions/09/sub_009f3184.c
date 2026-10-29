/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f3184..0x9f31e8 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f3184_0 {
    char padding_0[16];
    struct st_9f3184_1 *field_10;
} st_9f3184_0;

typedef struct st_9f3184_1 {
    unsigned long long field_0;
} st_9f3184_1;


int sub_9f3184(st_9f3184_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a6bf4c(48, "crypto/conf/conf_def.c", 115))
        return 0;
    a0->field_10();
}

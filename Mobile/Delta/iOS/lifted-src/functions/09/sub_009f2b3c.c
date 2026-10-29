/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2b3c..0x9f2b98 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2b3c_0 {
    char padding_0[32];
    struct st_9f2b3c_1 *field_20;
} st_9f2b3c_0;

typedef struct st_9f2b3c_1 {
    unsigned long long field_0;
} st_9f2b3c_1;


unsigned int sub_9f2b3c(st_9f2b3c_0 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0->field_20)
        return 0xffffffff;
    *a0->field_20();
}

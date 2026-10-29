/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ac420..0x9ac444 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ac420_0 {
    char padding_0[36];
    unsigned int field_24;
} st_9ac420_0;

typedef struct st_9ac420_1 {
    char padding_0[768];
    struct st_9ac420_0 *field_300;
} st_9ac420_1;


long long sub_9ac420(st_9ac420_1 *a0)
{
    if (a0->field_300->field_24 & 0x400000)
        return 1188;
    return 1013 & (int)(a0->field_300->field_24 * 0x100) >> 31;
}

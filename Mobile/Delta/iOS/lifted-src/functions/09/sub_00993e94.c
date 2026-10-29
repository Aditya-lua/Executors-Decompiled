/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x993e94..0x993eb0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_993e94_0 {
    char padding_0[1272];
    unsigned long long field_4f8;
} st_993e94_0;


long long sub_993e94(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, st_993e94_0 *a5)
{
    if (!a5->field_4f8)
        return a0;
    goto *((void *)(a5->field_4f8));
}

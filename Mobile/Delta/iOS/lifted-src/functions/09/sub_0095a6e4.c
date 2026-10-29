/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a6e4..0x95a720 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95a6e4_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_95a6e4_0;

extern char _NSHomeDirectory;

long long sub_95a6e4(st_95a6e4_0 *a0)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9568a0();
    if (((char)v2 * 0 | (char)(v2 >> 8)) <= 13)
        return *(long long *)(a0->field_8 + ((v2 * &_NSHomeDirectory | v2 >> 8) & 0xff0000ff & 0xff) * 8 + 1392);
    return 0;
}

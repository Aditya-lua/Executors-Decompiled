/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe6f68..0xbe704c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be6f68_1 {
    char padding_0[16];
    long long field_10;
    long long field_18;
} st_be6f68_1;

typedef struct st_be6f68_0 {
    char padding_0[8];
    struct st_be6f68_1 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_be6f68_0;


void sub_be6f68(st_be6f68_0 *a0)
{
    unsigned long long i;  // x22
    unsigned long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 14757395258967641293 * (a0->field_18 - (char *)a0->field_8 >> 3);
    for (v3 = &a0->field_8[1].padding_0[8]; i; i -= 1)
    {
        sub_b9f1a4(*(long long *)(v3 - 24), *(long long *)(v3 - 16));
        if (*(long long *)(v3 - 32))
            _free(*(long long *)(v3 - 24));
        v3 += 40;
    }
    if (!a0->field_10)
        return;
    _free();
    return;
}

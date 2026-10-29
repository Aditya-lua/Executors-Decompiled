/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7fa48..0xb7fa90 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7fa48_1 {
    char padding_0[8];
    struct st_b7fa48_0 *field_8;
} st_b7fa48_1;

typedef struct st_b7fa48_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b7fa48_0;


void sub_b7fa48(char *a0, st_b7fa48_1 *a1)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x3

    v0 = *a0;
    v1 = a1->field_8->field_18;
    if (!v0)
    {
        goto *((void *)(v1));
    }
    else if (v0 == 1)
    {
        goto *((void *)(v1));
    }
    else
    {
        goto *((void *)(v1));
    }
}

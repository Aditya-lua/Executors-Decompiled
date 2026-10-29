/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf394..0x9cf3c8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf394_2 {
    char padding_0[16];
    unsigned int field_10;
} st_9cf394_2;

typedef struct st_9cf394_0 {
    char padding_0[8];
    char field_8;
    char padding_9[23];
    int field_20;
} st_9cf394_0;

typedef struct st_9cf394_1 {
    char padding_0[32];
    struct st_9cf394_0 *field_20;
} st_9cf394_1;


long long sub_9cf394(unsigned long a0, st_9cf394_1 *a1)
{
    st_9cf394_0 *v0;  // x9
    st_9cf394_2 *v1;  // x8

    if (a0 && *(long long *)a0)
    {
        v0 = a1->field_20;
        if (v0 && v0->field_8 >> 1 & 1)
        {
            v1 = *(long long *)a0 + v0->field_20;
            *(unsigned long long *)&v1->padding_0[0] = 0;
            *(unsigned long long *)&v1->padding_0[8] = 0;
            v1->field_10 = 1;
        }
    }
    return a0;
}

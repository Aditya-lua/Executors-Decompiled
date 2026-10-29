/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb55f44..0xb55fb0 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b55f44_0 {
    unsigned long long field_0;
    unsigned int field_4;
    unsigned short field_6;
    char field_7;
} st_b55f44_0;


long long sub_b55f44(unsigned long a0, unsigned long a1)
{
    unsigned long long i;  // x8
    char *v1;  // x9
    st_b55f44_0 *v2;  // x10

    i = 0;
    do
    {
        v1 = a1 + i;
        v2 = a0 + i;
        *v1 = *((char *)&v2->field_0 + 7);
        v1[1] = *(short *)((char *)&v2->field_0 + 6);
        v1[2] = v2->field_0 >> 40;
        v1[3] = *(int *)((char *)&v2->field_0 + 4);
        v1[4] = v2->field_0 >> 24;
        v1[5] = v2->field_0 >> 16;
        v1[6] = v2->field_0 >> 8;
        v1[7] = v2->field_0;
        i += 8;
    } while (i != 64);
    return a0;
}

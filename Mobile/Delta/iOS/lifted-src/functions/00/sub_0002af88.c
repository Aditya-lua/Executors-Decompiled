/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2af88..0x2afec (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2af88_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[123];
    unsigned int field_80;
    char field_84;
    char padding_85[123];
    unsigned int field_100;
    char field_104;
} st_2af88_0;


unsigned int sub_2af88(unsigned long a0, st_2af88_0 *a1)
{
    unsigned int v0;  // w8
    unsigned long i;  // x9
    unsigned int *v2;  // x11
    unsigned long v3;  // x9
    unsigned int *v4;  // x11
    unsigned long v6;  // x9
    st_2af88_0 *v7;  // x1

    v0 = 2166136261;
    i = a1->field_100;
    if (!(unsigned int)i)
    {
        return 2166136261;
    }
    else if (a1->field_104 & 1)
    {
        v2 = &a1->field_80;
        do
        {
            v3 = i;
            v4 = v2 + 1;
            v0 = 16777619 * (*v2 ^ 16777619 * (*(int *)((char *)v2 - 128) ^ v0));
            i = v3 - 1;
            v2 = v4;
        } while (i);
        return v0;
    }
    else
    {
        do
        {
            v6 = i;
            v7 = &a1->field_4;
            v0 = 16777619 * (a1->field_0 ^ v0);
            a1 = v7;
            i = v6 - 1;
        } while (i);
        return v0;
    }
}

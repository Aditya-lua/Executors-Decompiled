/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5708..0x9e5748 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5708_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
} st_9e5708_0;


st_9e5708_0 * sub_9e5708(st_9e5708_0 *a0)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x8
    unsigned long long *v2;  // x9
    unsigned long long *v3;  // x9

    v0 = a0->field_8;
    v1 = v0;
    if ((int)v1 >= 1)
    {
        v2 = a0->field_0 + v0 * 8 - 8;
        while (1)
        {
            v1 = v0;
            v3 = (char *)v2 - 8;
            if (*v2)
                break;
            v0 = (unsigned int)v1 - 1;
            v2 = v3;
            if (1 >= (int)v1)
            {
                v1 = 0;
                break;
            }
        }
        a0->field_8 = v1;
    }
    if (!(unsigned int)v1)
    {
        a0->field_10 = 0;
        return a0;
    }
    return a0;
}

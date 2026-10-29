/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd898..0xafd8f8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afd898_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_afd898_0;


long long sub_afd898(long long a0, st_afd898_0 *a1, long long a2)
{
    unsigned long long *v2;  // x21
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (a2)
    {
        v2 = &a1->field_8;
        while (1)
        {
            v3 = a2;
            if (sub_a509f4(a0, *v2))
                return *(int *)((char *)v2 - 8);
            v2 += 2;
            a2 = v3 - 1;
            if (v3 == 1)
                return 0;
        }
    }
    else
    {
        return 0;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77bd4..0x77ccc (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_77bd4_0 {
    char field_0;
} st_77bd4_0;


long long sub_77bd4(unsigned long long a0, void* a1, unsigned long a2)
{
    void* i;  // x11
    void* v3;  // x1
    void* v4;  // x12
    void* v5;  // x1
    void* v6;  // x11
    void* v7;  // x1
    unsigned long long v9;  // x8
    st_77bd4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_77bd4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1)
    {
        i = a2 & 31;
        v3 = a1;
        if (i >= 8)
        {
            do
            {
                v3 = a1 + 8;
                i -= 8;
                a0 = 9650029242287828579 + 11400714785074694791 * __ROL__(11400714785074694791 * __ROL__(14029467366897019727 * *(long long *)a1, 31) ^ a0, 27);
                a1 = v3;
            } while (7 < i);
        }
        v4 = i - 4;
        if (i >= 4)
        {
            v5 = v3 + 4;
            a0 = 1609587929392839161 + 14029467366897019727 * __ROL__(11400714785074694791 * *(int *)v3 ^ a0, 23);
            v3 = v5;
            i = v4;
        }
        if (i)
        {
            do
            {
                v6 = i;
                v7 = v3 + 1;
                a0 = 11400714785074694791 * __ROL__(2870177450012600261 * *(char *)v3 ^ a0, 11);
                v3 = v7;
                i = v6 - 1;
            } while (i);
        }
    }
    v9 = 1609587929392839161 * (14029467366897019727 * (a0 ^ a0 >> 33) ^ 14029467366897019727 * (a0 ^ a0 >> 33) >> 29);
    return v9 ^ v9 >> 32;
}

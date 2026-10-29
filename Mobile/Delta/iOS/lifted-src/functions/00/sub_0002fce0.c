/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2fce0..0x2fdb0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2fce0_0 {
    char field_0;
} st_2fce0_0;


void* sub_2fce0(void* a0, void* a1)
{
    unsigned long long v2;  // x11
    unsigned long v3;  // x9
    void* v12;  // x8
    void* v13;  // x8
    void* v14;  // x11
    void* v15;  // x11
    unsigned long long v4;  // x11
    unsigned long long v5;  // x11
    void* i;  // x10
    void* v7;  // x8
    void* v8;  // x1
    void* v9;  // x1
    void* v10;  // x1
    unsigned long v11;  // x12
    st_2fce0_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_2fce0_0 *v1;  // [bp-0x8]

    v2 = 0;
    v1 = &v0;
    v0 = &v1;
    v3 = *(long long *)a0;
    do
    {
        v4 = v2;
        v5 = v4 + 8;
        v2 = v5;
    } while ((unsigned int)*(int *)((char *)a0 + v4 + 8) < (unsigned int)v3);
    i = a0 + v5;
    v7 = i - 8;
    if (v5 != 8)
    {
        do
        {
            v8 = a1;
            v9 = v8 - 8;
            a1 = v9;
        } while ((unsigned int)v3 <= (unsigned int)*(int *)((char *)v8 - 8));
    }
    else
    {
        do
        {
            v10 = a1;
            v9 = v10;
        } while (i < v9 && (a1 = v10 - 8, v9 = a1, (unsigned int)*(int *)((char *)v10 - 8) >= (unsigned int)v3));
    }
    if (v9 > i)
    {
        do
        {
            v11 = *(long long *)i;
            *(long long *)i = *(long long *)v9;
            *(unsigned long *)v9 = v11;
            v12 = i;
            do
            {
                v13 = v12;
                i = v13 + 8;
                v12 = i;
                v14 = v9;
            } while ((unsigned int)(int)v13[8] < (unsigned int)v3);
            do
            {
                v15 = v14;
                v9 = v15 - 8;
                v14 = v9;
            } while ((unsigned int)v3 <= (unsigned int)*(int *)((char *)v15 - 8));
        } while (i < v9);
        v7 = i - 8;
    }
    if (v7 != a0)
        *(long long *)a0 = *(long long *)v7;
    *(unsigned long *)v7 = v3;
    return v7;
}

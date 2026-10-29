/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29d5c..0x29e20 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29d5c_0 {
    char field_0;
} st_29d5c_0;


void* sub_29d5c(void* a0, void* a1)
{
    unsigned long v2;  // x9
    void* v3;  // x8
    void* v12;  // x8
    void* v13;  // x8
    void* v14;  // x1
    void* v15;  // x10
    void* v4;  // x8
    void* v5;  // x8
    void* v6;  // x10
    void* v7;  // x10
    void* v8;  // x1
    void* v9;  // x1
    void* v10;  // x1
    unsigned long v11;  // x10
    st_29d5c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_29d5c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = *(long long *)a0;
    if ((unsigned int)*(int *)((char *)a1 - 8) > (unsigned int)v2)
    {
        v3 = a0;
        do
        {
            v4 = v3;
            v5 = v4 + 8;
            v3 = v5;
        } while ((unsigned int)(int)v4[8] <= (unsigned int)v2);
    }
    else
    {
        v6 = a0 + 8;
        do
        {
            v5 = v6;
        } while (a1 > v6 && (v7 = v5, v6 = v7 + 8, (unsigned int)*(int *)v7 <= (unsigned int)v2));
    }
    v8 = a1;
    if (v8 > v5)
    {
        do
        {
            v9 = a1;
            v8 = v9 - 8;
            a1 = v8;
        } while ((unsigned int)v2 < (unsigned int)*(int *)((char *)v9 - 8));
    }
    while (1)
    {
        v10 = v8;
        if (v5 >= v10)
            break;
        v11 = *(long long *)v5;
        *(long long *)v5 = *(long long *)v10;
        *(unsigned long *)v10 = v11;
        do
        {
            v12 = v5;
            v13 = v12 + 8;
            v5 = v13;
        } while ((unsigned int)(int)v12[8] <= (unsigned int)v2);
        do
        {
            v14 = v10;
            v8 = v14 - 8;
            v10 = v8;
            v5 = v13;
        } while ((unsigned int)v2 < (unsigned int)*(int *)((char *)v14 - 8));
    }
    v15 = v5 - 8;
    if (v15 != a0)
        *(long long *)a0 = *(long long *)v15;
    *(unsigned long *)((char *)v5 - 8) = v2;
    return v5;
}

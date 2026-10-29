/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16e9c..0x16f2c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16e9c_2 {
    char padding_0[8];
    void* field_8;
} st_16e9c_2;

typedef struct st_16e9c_3 {
    struct st_16e9c_2 *field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_16e9c_3;

typedef struct st_16e9c_0 {
    char field_0;
} st_16e9c_0;

extern unsigned long long g_e627e8;
extern unsigned long long g_e62820;
extern unsigned int g_f00b60;
extern unsigned int g_f00b70;

long long sub_16e9c(st_16e9c_3 *a0, unsigned long a1)
{
    unsigned long long *v2;  // x9
    st_16e9c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_16e9c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_10)
    {
        return 0 == a1;
    }
    else if (*(int *)(*(long long *)((char *)a0->field_0->field_8 - 8) + 8) == g_f00b70)
    {
        goto *((void *)(g_e62820));
    }
    else
    {
        if (*(int *)(*(long long *)((char *)a0->field_0->field_8 - 8) + 8) == g_f00b60)
            v2 = &g_e62820;
        else
            v2 = &g_e627e8;
        goto *((void *)(*v2));
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc582c..0xc599c (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c582c_0 {
    char field_0;
} st_c582c_0;

extern unsigned long long g_e6cf70;
extern unsigned long long g_e6cfb0;

int sub_c582c(unsigned long idx, unsigned int *a1, unsigned long a2)
{
    unsigned long long v4;  // x9
    unsigned long long v5;  // x8
    st_c582c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_c582c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (7 >= a2)
    {
        v4 = *(long long *)(idx + 29888);
        *(unsigned long long *)(idx + 29912) = v4;
        *(unsigned int **)(idx + 29904) = (char *)a1 + *(long long *)(idx + 29896) - v4;
        *(unsigned int **)(idx + 29896) = a1;
        *(unsigned int **)(idx + 29888) = (char *)a1 + a2;
        return 0;
    }
    if (*a1 == 3962610743)
    {
        goto *((void *)(g_e6cfb0));
    }
    else
    {
        v5 = *(long long *)(idx + 29888);
        *(unsigned long long *)(idx + 29912) = v5;
        *(unsigned int **)(idx + 29904) = (char *)a1 + *(long long *)(idx + 29896) - v5;
        *(unsigned int **)(idx + 29896) = a1;
        *(unsigned int **)(idx + 29888) = (char *)a1 + a2;
        goto *((void *)(g_e6cf70));
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7cf40..0x7d05c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7cf40_0 {
    char field_0;
} st_7cf40_0;


unsigned int * sub_7cf40(long long a0, long long a1, long long a2, long long a3, long long a4, unsigned int *a5, long long a6, unsigned int *a7, unsigned long a8, long long a9)
{
    unsigned int *v3;  // x0
    st_7cf40_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_7cf40_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]

    v2 = &a8;
    v1 = &v0;
    v0 = &v1;
    if (a5 && (unsigned long long)a6 > 7)
    {
        sub_7f794();
        if (a7 == 1)
        {
            sub_7d6c4(a1, a2, a3, a4, a5, a6, (unsigned int)a8, *(unsigned int *)((void*)&a8 + 4));
            return 0;
        }
        if (*a5 == 3962610743)
        {
LABEL_7d00c:
            return sub_7e150(a0, a1, a3, a4, a5, a6, (unsigned int)a8, *(unsigned int *)((void*)&a8 + 4), a9);
        }
        switch (a7)
        {
        case 2:
            return 0xffffffffffffffe0;
        case 0:
            sub_7d6c4(a1, a2, a3, a4, a5, a6, (unsigned int)a8, *(unsigned int *)((void*)&a8 + 4));
            return 0;
        default:
            goto LABEL_7d00c;
        }
    }
    if (a7 == 2)
        v3 = 0xffffffffffffffe0;
    else
        v3 = 0;
    return v3;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b1cd8..0x9b1d7c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b1cd8_0 {
    struct st_9b1cd8_0 *field_0;
} st_9b1cd8_0;


st_9b1cd8_0 ** sub_9b1cd8(long long a0, unsigned long long a1, st_9b1cd8_0 **a2, st_9b1cd8_0 **a3, st_9b1cd8_0 **a4, st_9b1cd8_0 **a5)
{
    st_9b1cd8_0 **v2;  // x25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        return 0;
    }
    else if (a3)
    {
        v2 = 0;
        while (*(short *)((char *)a2 + 0x2 * v2) != (unsigned int)a1 || a4 && !sub_968218(a0, a1, 0x20006))
        {
            if (a3 == (char *)v2 + 1)
                return 0;
        }
        if (!a5)
            return 1;
        *a5 = v2;
        return 1;
    }
    else
    {
        return 0;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62884..0x628ac (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62884_0 {
    char padding_0[16];
    struct st_62884_1 *field_10;
} st_62884_0;

typedef struct st_62884_1 {
    struct st_62884_0 *field_0;
} st_62884_1;


st_62884_0 ** sub_62884(st_62884_0 **a0)
{
    st_62884_0 *i;  // x0
    unsigned long v1;  // x0

    if (!*a0)
    {
        do
        {
            i = a0;
            v1 = i->field_10;
            a0 = v1;
        } while (*a0 == i);
        return v1;
    }
}

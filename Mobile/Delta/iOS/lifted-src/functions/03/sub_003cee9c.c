/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cee9c..0x3cef5c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cee9c_0 {
    char field_0;
} st_3cee9c_0;


char * sub_3cee9c(long long a0, char *a1)
{
    unsigned int v4;  // w21
    unsigned long long v5;  // x22
    st_3cee9c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3cee9c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_3d706c();
    v5 = 0;
    if (!sub_3d2248(a0) && v4 != 10)
    {
        v5 = 0;
        do
        {
            a1[v5] = v4;
            if (v5 == 0x3fe)
            {
                v5 = 0x3ff;
                do
                { } while (!sub_3d2248(a0) && sub_3d706c(a0) != 10);
            }
        } while ((v4 = sub_3d706c(a0), v5 += 1, !sub_3d2248(a0) && v4 != 10));
    }
    a1[v5] = 0;
    return a1;
}

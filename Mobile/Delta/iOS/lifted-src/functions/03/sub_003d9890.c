/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d9890..0x3d98f8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d9890_0 {
    char field_0;
} st_3d9890_0;


int sub_3d9890(char *a0, unsigned long long a1)
{
    char *v4;  // x0
    unsigned long long i;  // x21
    unsigned int v6;  // w22
    st_3d9890_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3d9890_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0;
    if (a1)
    {
        i = 0;
        v6 = 1;
        do
        {
            v4 = ___tolower(a0[i]);
            a0[i] = (char)v4;
            i = v6;
            v6 += 1;
        } while (i < a1);
    }
    return (unsigned int)v4;
}

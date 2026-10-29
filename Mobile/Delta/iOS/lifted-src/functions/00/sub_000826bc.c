/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x826bc..0x82758 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_826bc_0 {
    char field_0;
} st_826bc_0;


long long sub_826bc(unsigned long a0, long long a1, long long a2, long long a3, unsigned int a4, unsigned long a5, long long a6)
{
    st_826bc_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_826bc_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((unsigned long long)a2 >= 0x20000 && (unsigned long long)a3 > "R")
    {
        if (a6 < 3)
        {
            return 0x20000;
        }
        else if (a4 != 1)
        {
            return sub_bf2c4(a1, a3);
        }
        else
        {
            return 0x20000;
        }
    }
    if ((unsigned long long)a2 >= (unsigned long long)a3)
        return a3;
    return a2;
}

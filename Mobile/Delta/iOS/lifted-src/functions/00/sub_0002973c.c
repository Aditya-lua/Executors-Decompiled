/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2973c..0x29808 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2973c_0 {
    char field_0;
} st_2973c_0;


void* sub_2973c(void* a0, void* a1, void* a2, unsigned long a3)
{
    void* iter;  // x23
    unsigned long v5;  // x8
    st_2973c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_2973c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return a2;
    sub_2bcf8();
    iter = a1;
    if (a1 != a2)
    {
        iter = a1;
        do
        {
            if ((unsigned int)*(int *)a0 > (unsigned int)*(int *)iter)
            {
                v5 = *(long long *)iter;
                *(long long *)iter = *(long long *)a0;
                *(unsigned long *)a0 = v5;
                sub_2e128(a0);
            }
        } while ((iter += 8, iter != a2));
    }
    sub_310e8(a0, a1);
    return iter;
}

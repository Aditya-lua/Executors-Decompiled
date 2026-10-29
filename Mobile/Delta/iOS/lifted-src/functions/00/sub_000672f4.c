/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x672f4..0x673ec (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_672f4_0 {
    char field_0;
} st_672f4_0;


long long sub_672f4(long long *a0, long long a1, long long a2)
{
    unsigned int v4;  // w1
    long long v5;  // x20
    st_672f4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_672f4_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(a0 + 31);
    if (a0[11] && a0[12])
    {
        sub_a35af4();
        v4 = sub_9602d0(a0[11], a1, a2);
        if ((int)v4 >= 1)
        {
            v5 = v4;
        }
        else
        {
            if ((sub_9625a4(a0[11]) & 0xfffffffe) == 2)
                *(unsigned int *)___error() = 35;
            v5 = -0x1;
        }
    }
    else
    {
        v5 = 0;
    }
    std::__1::mutex::unlock(a0 + 31);
    return v5;
}

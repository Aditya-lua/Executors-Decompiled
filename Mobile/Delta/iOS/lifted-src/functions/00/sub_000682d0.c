/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x682d0..0x683c0 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_682d0_0 {
    char field_0;
} st_682d0_0;

extern unsigned long long g_e6a560;
extern unsigned long long g_e6a578;

long long sub_682d0(long long *a0, long long a1)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x21
    st_682d0_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_682d0_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (!a0[11])
    {
        return 0;
    }
    else if (a0[12])
    {
        sub_a35af4();
        v5 = sub_95fb6c(a0[11]);
        if ((unsigned int)v5 != 1)
        {
            v6 = v5;
            if ((sub_9625a4(a0[11], v6) & 0xfffffffe) != 2)
            {
                sub_67f54(a0, v6);
                sub_5ccc(a1, &v2);
            }
            else
            {
                goto *((void *)(g_e6a578));
            }
        }
        goto *((void *)(g_e6a560));
    }
    else
    {
        return 0;
    }
}

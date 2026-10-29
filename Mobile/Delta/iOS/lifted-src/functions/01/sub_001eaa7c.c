/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eaa7c..0x1eab0c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eaa7c_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_1eaa7c_0;

extern st_1eaa7c_0 g_ccab54;
extern st_1eaa7c_0 g_cd1f54;
extern unsigned int g_cd26fc[4];

int sub_1eaa7c(unsigned int *a0, unsigned int a1)
{
    unsigned int *v0;  // x8

    if (125251 >= a1)
    {
        v0 = &g_cd26fc[(&g_ccab54.field_0)[(&g_cd1f54.field_0)[a1 >> 8] + (a1 & 0xff) & 0xffffffff]];
        if (*v0)
        {
            *a0 = *v0;
            if (!v0[1])
                return 1;
            a0[1] = v0[1];
            if (!v0[2])
                return 2;
            a0[2] = v0[2];
            if (!v0[3])
                return 3;
            a0[3] = v0[3];
            return 4;
        }
    }
    *a0 = a1;
    return 1;
}

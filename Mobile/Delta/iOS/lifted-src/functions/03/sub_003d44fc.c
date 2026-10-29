/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d44fc..0x3d45d0 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d44fc_0 {
    char field_0;
} st_3d44fc_0;

extern unsigned long long g_e7e5b8;

void sub_3d44fc(void* a0, unsigned long long a1)
{
    st_3d44fc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d44fc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(unsigned int)a1)
    {
        return;
    }
    else if (a1 >> 31 & 1)
    {
        *(long long *)&a0[192] = (long long)a0[200];
        return;
    }
    else if (!(long long)a0[16])
    {
        *(unsigned long long *)&a0[192] = (long long)a0[192] + (a1 & 0xffffffff);
        return;
    }
    else if ((int)a1 > (int)((long long)a0[200] - (int)a0[192]))
    {
        *(long long *)&a0[192] = (long long)a0[200];
        (long long)a0[24]();
    }
    else
    {
        goto *((void *)(g_e7e5b8));
    }
}

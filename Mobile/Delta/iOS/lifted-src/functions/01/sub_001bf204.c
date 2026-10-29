/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bf204..0x1bf2fc (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bf204_0 {
    char field_0;
} st_1bf204_0;

extern unsigned long long g_e72628;
extern unsigned long long g_e72630;

int sub_1bf204(long long a0, long long a1, unsigned long a2, unsigned int *a3)
{
    st_1bf204_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1bf204_0 *v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x44]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (sub_6b08() <= (unsigned long long)a1)
        return 0;
    *a3 = 0;
    if (!a2)
    {
        return 1;
    }
    else if (*(char *)sub_2fa10(a0, a1))
    {
        v2 = 0;
        if (sub_1b7db0(*(char *)sub_2fa10(a0, a1), &v2))
        {
            *a3 = v2 + *a3 * 16;
            goto *((void *)(g_e72628));
        }
        else
        {
            goto *((void *)(g_e72630));
        }
    }
    else
    {
        return 0;
    }
}

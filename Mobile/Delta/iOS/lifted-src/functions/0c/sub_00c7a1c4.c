/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc7a1c4..0xc7a25c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c7a1c4_0 {
    unsigned long long field_0;
} st_c7a1c4_0;

extern char g_e09d80;
extern st_c7a1c4_0 *g_f0b1f8;

void sub_c7a1c4(unsigned long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (*a0 != 6076294132934528845)
    {
        a0 = __Unwind_DeleteException();
    }
    else if (a0[4] == &g_e09d80)
    {
        _free();
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        g_f0b1f8();
    }
    sub_c5f774(a0);
}

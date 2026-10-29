/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadaf90..0xadb098 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adaf90_0 {
    unsigned long long field_0;
} st_adaf90_0;

extern unsigned int g_f09368;
extern char g_10002b0;

long long sub_adaf90(long long a0, long long a1)
{
    long long v3;  // x0
    st_adaf90_0 **v4;  // x0
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if (sub_9c7b68(a1) == 1)
    {
        v3 = sub_954340(a0);
        v4 = sub_ada450(v3, g_f09368);
        sub_c4ba8();
        (*v4)();
    }
    if (*(long long *)&g_10002b0 == v0)
        return 1;
    ___stack_chk_fail();
}

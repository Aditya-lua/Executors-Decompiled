/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3c14..0xac3d30 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3c14_2 {
    char padding_0[168];
    struct st_ac3c14_0 *field_a8;
} st_ac3c14_2;

typedef struct st_ac3c14_0 {
    char padding_0[72];
    struct st_ac3c14_1 *field_48;
} st_ac3c14_0;

typedef struct st_ac3c14_1 {
    unsigned long long field_0;
} st_ac3c14_1;

typedef struct st_ac3c14_3 {
    struct st_ac3c14_2 *field_0;
} st_ac3c14_3;

extern char g_10002b0;

int sub_ac3c14(st_ac3c14_3 **a0)
{
    st_ac3c14_2 **v3;  // x0
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if (a0[16] && (int)a0[19])
    {
        v3 = sub_ac363c();
        if (v3)
            *v3->field_a8->field_48();
    }
    else
    {
        v3 = 0;
    }
    if (*(long long *)&g_10002b0 == v0)
        return (unsigned int)v3;
    ___stack_chk_fail();
}

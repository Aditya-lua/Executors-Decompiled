/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadf884..0xadf9c0 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adf884_0 {
    struct st_adf884_0 *field_0;
    struct st_adf884_0 *field_8;
} st_adf884_0;

extern long long g_eb50c0;
extern long long g_eb5148;

st_adf884_0 * sub_adf884(long long a0, unsigned long a1, st_adf884_0 *a2)
{
    unsigned long long v4;  // x20
    st_adf884_0 *v5;  // x22
    st_adf884_0 *v6;  // x0
    st_adf884_0 *v7;  // x21
    st_adf884_0 *v8;  // x0
    st_adf884_0 *v9;  // x0
    unsigned short v0;  // [bp-0x43]
    char v1;  // [bp-0x41]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = (((((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
    if (a2)
    {
        v1 = (int)a2->field_0;
        v4 = 3;
    }
    else
    {
        v4 = 2;
    }
    if ((int)sub_ad69e4(a0) >= 1)
    {
        v5 = 0;
        do
        {
            v6 = sub_ad69f8(a0, v5);
            if ((int)v6->field_0->field_0 == (unsigned int)v4 && !_memcmp(v6->field_0->field_8, &v0, v4 & 0xffffffff))
                return v6;
        } while ((v5 = (unsigned int)v5 + 1, (int)sub_ad69e4(a0) > (int)(unsigned int)v5));
    }
    v7 = sub_9cde20(&g_eb5148);
    if (v7 && (v7->field_8 || (v8 = sub_9cde20(&g_eb50c0), v7->field_8 = v8, v8)))
    {
        v9 = v7->field_0;
        if (v9 || (v9 = sub_9cf0ec(NULL), v7->field_0 = v9, v9))
        {
            if (sub_9c026c(v9, &v0, v4) && sub_ad68a0(a0, v7))
                return v7;
        }
    }
    sub_9cd960(v7, &g_eb5148);
    return 0;
}

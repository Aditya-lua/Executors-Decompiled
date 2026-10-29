/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa344cc..0xa34614 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a344cc_0 {
    char padding_0[136];
    struct st_a344cc_0 *field_88;
    char padding_90[16];
    struct st_a344cc_0 *field_a0;
} st_a344cc_0;

extern long long g_f0d560;

st_a344cc_0 * sub_a344cc(st_a344cc_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_pkey.c", 121, "ENGINE_load_ssl_client_cert");
        v2 = 786690;
    }
    else if (sub_a7c198(g_f0d560))
    {
        sub_a7c1b4(g_f0d560);
        if (!(int)a0->field_a0)
        {
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_pkey.c", 128, "ENGINE_load_ssl_client_cert");
            v2 = 117;
        }
        else if (a0->field_88)
        {
            goto *((void *)(a0->field_88));
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_pkey.c", 133, "ENGINE_load_ssl_client_cert");
            v2 = 125;
        }
    }
    else
    {
        return 0;
    }
    sub_a36abc(38, v2, 0);
    return 0;
}

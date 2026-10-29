/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33620..0xa336c4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33620_0 {
    char padding_0[192];
    struct st_a33620_0 *field_c0;
} st_a33620_0;

extern long long g_f0d560;

st_a33620_0 * sub_a33620(st_a33620_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_list.c", 288, "ENGINE_get_next");
        sub_a36abc(38, 0xc0102, 0);
    }
    else if (sub_a7c198(g_f0d560))
    {
        if (a0->field_c0)
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
        }
        sub_a7c1b4(g_f0d560);
        sub_a330d4(a0);
        return a0->field_c0;
    }
    return 0;
}

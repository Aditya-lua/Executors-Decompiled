/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadae68..0xadaf88 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adae68_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_adae68_0;

extern unsigned long long g_a9be54;
extern long long g_adaf90;
extern long long g_adb0a8;
extern long long g_f09358;
extern unsigned int g_f09368;
extern char g_f13278;

unsigned long long sub_adae68(unsigned long long a0, unsigned int a1)
{
    st_adae68_0 *v2;  // x19
    unsigned long long v3;  // x0
    unsigned long long v4;  // x22
    unsigned long long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/ui/ui_util.c", 148);
    if (v2 && (v3 = sub_ada2a4("PEM password callback wrapper"), v3))
    {
        v4 = v3;
        if (sub_ada3d8() >> 31 & 1 || sub_ada410(v4, &g_adaf90) >> 31 & 1 || sub_ada3f4(v4, " ") >> 31 & 1 || sub_ada42c(v4, " ") >> 31 & 1 || !sub_a7c208(&g_f09358, &g_adb0a8))
        {
LABEL_adaf58:
        }
        else if (g_f13278)
        {
            if (sub_ada448(v4, g_f09368, v2))
            {
                v2->field_8 = a1;
                v5 = &g_a9be54;
                if (a0)
                    v5 = a0;
                v2->field_0 = v5;
                return v4;
            }
            goto LABEL_adaf58;
        }
    }
    sub_ada37c();
    sub_a6c2e4(v2, "crypto/ui/ui_util.c", 157);
    return 0;
}

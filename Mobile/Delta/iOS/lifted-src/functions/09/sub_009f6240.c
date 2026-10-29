/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f6240..0x9f6344 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f6240_0 {
    long long field_0;
    struct st_9f6240_1 *field_8;
    unsigned long long field_10;
} st_9f6240_0;

typedef struct st_9f6240_1 {
    long long field_0;
} st_9f6240_1;

extern unsigned long long g_f127e8;
extern unsigned long long g_f127f0;

unsigned long long sub_9f6240(void)
{
    unsigned long long v2;  // x22
    st_9f6240_0 *v3;  // x24
    unsigned long long v4;  // x25
    unsigned long long i;  // x26
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!g_f127e8)
        return g_f127e8;
    if (g_f127f0)
    {
        v2 = 0;
        do
        {
            v3 = g_f127e8 + 24 * v2;
            sub_a6c2e4(v3->field_0, "crypto/conf/conf_ssl.c", 49);
            if (v3->field_10)
            {
                v4 = 0;
                i = 0;
                do
                {
                    sub_a6c2e4(*(long long *)((char *)v3->field_8 + v4), "crypto/conf/conf_ssl.c", 0x33);
                    sub_a6c2e4(*(long long *)((char *)v3->field_8 + v4 + 8), "crypto/conf/conf_ssl.c", 52);
                    i += 1;
                    v4 += 16;
                } while (i < v3->field_10);
            }
        } while ((sub_a6c2e4(v3->field_8, "crypto/conf/conf_ssl.c", 54), v2 += 1, g_f127f0 > v2));
    }
    v6 = sub_a6c2e4();
    g_f127e8 = 0;
    g_f127f0 = 0;
    return v6;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b1d7c..0x9b1e94 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b1d7c_0 {
    char padding_0[8];
    long long field_8;
} st_9b1d7c_0;

typedef struct st_9b1d7c_1 {
    char padding_0[248];
    struct st_9b1d7c_0 *field_f8;
    char padding_100[496];
    unsigned long long field_2f0;
} st_9b1d7c_1;

extern char g_10002b0;

unsigned long long sub_9b1d7c(st_9b1d7c_1 *a0, char *a1, char *a2, char *a3, long long a4)
{
    unsigned long long v7;  // x0
    unsigned int v0;  // [bp-0x84]
    char v1;  // [bp-0x81]
    char *v2;  // [bp-0x80]
    char v3;  // [bp-0x78]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v2 = a2;
    v0 = 254;
    if (a1 || (v2 = 0, v7 = sub_9545a8(a0), (unsigned int)v7 && !(a1 = &v3, v7 = sub_962d78(a0, &v3, 64, &v2), !(unsigned int)v7)))
    {
        v7 = sub_954420(a0);
        if ((unsigned int)v7)
        {
            v1 = (char)v2;
            v7 = sub_9544f0(a0, &v0, 4);
            if ((unsigned int)v7)
            {
                v7 = sub_9544f0(a0, a1, v2);
                if ((unsigned int)v7 && (!a3 || (v7 = sub_9544f0(a0, a3, a4), (unsigned int)v7 && !(v7 = sub_9544f0(a0, a0->field_f8->field_8, a0->field_2f0 + 4), !(unsigned int)v7))))
                    v7 = 1;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
}

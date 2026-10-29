/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5f24..0x9f5fa0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f5f24_0 {
    long long field_0;
} st_9f5f24_0;

extern st_9f5f24_0 *g_f127e8;
extern long long g_f127f0;

int sub_9f5f24(long long a0, long long *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x22
    long long *v17;  // x23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a0)
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        if (g_f127f0)
        {
            v16 = 0;
            v17 = g_f127e8;
            do
            {
                if (!_strcmp(*v17, a0))
                {
                    *a1 = v16;
                    a0 = 1;
                    goto LABEL_9f5f8c;
                }
            } while ((v16 += 1, v17 += 3, g_f127f0 != v16));
        }
        a0 = 0;
LABEL_9f5f8c:
    }
    return a0;
}

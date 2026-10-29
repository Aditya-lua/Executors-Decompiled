/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4220c..0xa4238c (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4220c_0 {
    char padding_0[248];
    unsigned int field_f8;
    unsigned int field_fc;
    char field_100;
    char padding_101[447];
    long long field_2c0;
    int field_2c8;
} st_a4220c_0;

extern long long g_9b8de4;
extern long long g_9b96e0;
extern unsigned int g_9bb300;
extern unsigned int g_f0d568;

unsigned int sub_a4220c(long long a0, unsigned int a1, long long a2)
{
    long long v2;  // x20
    st_a4220c_0 *v3;  // x0
    st_a4220c_0 *v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_9ffdd8();
    if (!a1 && !v2)
        return 1;
    v4 = v3;
    if (!a1)
    {
        if (v4->field_f8)
            sub_a94bbc(&v4->field_100, v2, v4->field_2c8);
        else
            _memcpy(v4->field_2c0, v2, v4->field_2c8);
        v4->field_fc = 1;
        *(unsigned int *)&v4[1].padding_0[4] = 0;
        return 1;
    }
    else if ((int)sub_a50904(a0) >= 1)
    {
        if (!(g_f0d568 >> 2 & 1))
        {
            sub_9b8880(a1);
            sub_a94ad4(&v4->field_100, v4, &g_9b8de4);
            if (!(g_f0d568 & 1))
            {
                *(unsigned long long *)&v4[1].padding_0[28] = 0;
                if (!v2)
                    goto LABEL_a4234c;
            }
            else
            {
                *(char **)&v4[1].padding_0[28] = "_ ";
                if (!v2)
                {
LABEL_a4234c:
                    if (!v4->field_fc)
                    {
                        v4->field_f8 = 1;
                        return 1;
                    }
                    v2 = v4->field_2c0;
                    if (!v2)
                    {
                        v4->field_f8 = 1;
                        return 1;
                    }
                }
            }
        }
        else
        {
            sub_9b9440(a1);
            sub_a94ad4(&v4->field_100, v4, &g_9b96e0);
            *(unsigned int **)&v4[1].padding_0[28] = &g_9bb300;
            if (!v2)
                goto LABEL_a4234c;
        }
        sub_a94bbc(&v4->field_100, v2, v4->field_2c8);
        v4->field_fc = 1;
        v4->field_f8 = 1;
        return 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/e_aes.c", 2806, "aes_gcm_init_key");
        sub_a36abc(6, 130, 0);
        return 0;
    }
}

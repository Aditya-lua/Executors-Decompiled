/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a72fc..0x9a74a0 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a72fc_2 {
    char padding_0[24];
    struct st_9a72fc_1 *field_18;
    char padding_20[140];
    int field_ac;
} st_9a72fc_2;

typedef struct st_9a72fc_1 {
    char padding_0[216];
    struct st_9a72fc_0 *field_d8;
} st_9a72fc_1;

typedef struct st_9a72fc_0 {
    char padding_0[80];
    unsigned int field_50;
} st_9a72fc_0;

extern unsigned int g_9a74a0;
extern unsigned int g_9a79d0;
extern unsigned int g_9a7a40;
extern unsigned int g_9a7c1c;
extern unsigned int g_9a8834;
extern unsigned long long g_9ad3f0;
extern unsigned int g_9ae6f0;
extern unsigned int g_9af2d0;
extern unsigned int g_9af49c;
extern unsigned long long g_9afbc8;

unsigned int sub_9a72fc(st_9a72fc_2 *a0, unsigned long a1, int *a2)
{
    int v5;  // w8
    unsigned long long v6;  // x9
    int v8;  // w8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (18 >= a0->field_ac)
    {
        switch (v5)
        {
        case 16:
            *(unsigned int **)a1 = &g_9a7c1c;
            v8 = 16;
            break;
        case 13:
            *(unsigned int **)a1 = &g_9a74a0;
            *a2 = 1;
            return 1;
        case 17:
            *(unsigned int **)a1 = &g_9ae6f0;
            v8 = 15;
            break;
        case 14:
            *(unsigned int **)a1 = &g_9a7a40;
            v8 = 11;
            break;
        case 18:
            v6 = &g_9ad3f0;
            if (!(a0->field_18->field_d8->field_50 & 8))
                v6 = &g_9afbc8;
            *(unsigned long long *)a1 = v6;
            v8 = 0x101;
            break;
        default:
            v0 = v9;
            v1 = v10;
            v2 = &v4;
            v3 = v11;
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 956, "ossl_statem_client_construct_message");
            sub_9a58a4(a0, 80, 236, 0);
            return 0;
        }
    }
    else
    {
        switch (v5)
        {
        case 47:
            *(unsigned int **)a1 = &g_9af49c;
            v8 = 24;
            break;
        case 19:
            *(unsigned int **)a1 = &g_9a8834;
            v8 = 67;
            break;
        case 51:
            *(unsigned long long *)a1 = 0;
            v8 = -0x1;
            break;
        case 20:
            *(unsigned int **)a1 = &g_9af2d0;
            v8 = 20;
            break;
        case 52:
            *(unsigned int **)a1 = &g_9a79d0;
            v8 = 5;
            break;
        default:
            v0 = v9;
            v1 = v10;
            v2 = &v4;
            v3 = v11;
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 956, "ossl_statem_client_construct_message");
            sub_9a58a4(a0, 80, 236, 0);
            return 0;
        }
    }
    *a2 = v8;
    return 1;
}

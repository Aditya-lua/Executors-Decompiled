/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9662a0..0x9663bc (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9662a0_0 {
    char padding_0[80];
    char field_50;
    char padding_51[519];
    char field_258;
    char padding_259[71];
    long long field_2a0;
    long long field_2a8;
    char padding_2b0[8];
    long long field_2b8;
    long long field_2c0;
    long long field_2c8;
    char padding_2d0[64];
    char field_310;
    char padding_311[15];
    long long field_320;
    long long field_328;
    char padding_330[24];
    long long field_348;
    char padding_350[16];
    long long field_360;
    long long field_368;
} st_9662a0_0;


void sub_9662a0(st_9662a0_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(19, v2, 1, 0);
    if (!(v3 & 1))
    {
        /* unsupported instruction */;
    }
    else if ((int)v2 > 1)
    {
        return;
    }
    sub_a6a9e8(2, a0, &a0->field_310);
    sub_a66ec0(&a0->field_50, 0x200);
    sub_a66ec0(&a0->field_258, 32);
    sub_afc404(a0->field_2c0);
    sub_a5a4c8(a0->field_2b8);
    sub_aded90(a0->field_2c8);
    sub_a6c2e4(a0->field_320, "ssl/ssl_sess.c", 863);
    sub_a6c2e4(a0->field_328, "ssl/ssl_sess.c", 864);
    sub_a6c2e4(a0->field_2a0, "ssl/ssl_sess.c", 866);
    sub_a6c2e4(a0->field_2a8, "ssl/ssl_sess.c", 867);
    sub_a6c2e4(a0->field_360, "ssl/ssl_sess.c", 870);
    sub_a6c2e4(a0->field_348, "ssl/ssl_sess.c", 872);
    sub_a6c2e4(a0->field_368, "ssl/ssl_sess.c", 873);
}
